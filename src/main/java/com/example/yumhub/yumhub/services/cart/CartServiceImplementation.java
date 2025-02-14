package com.example.yumhub.yumhub.services.cart;

import com.example.yumhub.yumhub.DTO.CartDto;
import com.example.yumhub.yumhub.models.Cart;
import com.example.yumhub.yumhub.models.Foods;
import com.example.yumhub.yumhub.models.User;
import com.example.yumhub.yumhub.repository.CartRepository;
import com.example.yumhub.yumhub.repository.FoodRepository;
import com.example.yumhub.yumhub.repository.UserRepository;
import com.example.yumhub.yumhub.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CartServiceImplementation implements CartService {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Cart addToCart(CartDto cartDto) throws Exception {
        User getUser = userService.getUserById(cartDto.getUserId());
        Optional<Foods> foods = foodRepository.findById(cartDto.getFoodId());
        Cart cart = new Cart();
        if (foods.isEmpty()){
            throw new Exception("food not found");
        }else {
            cart.setFood(foods.get());
        }
        if (getUser == null){
            throw new Exception("User not found");
        }else {
            cart.setUser(getUser);
        }
        cart.setQuantity(cartDto.getQuantity());

        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(UUID cartId, int quantity) {
        Cart cart = cartRepository.findById(cartId).orElseThrow();
        cart.setQuantity(quantity);
        return cartRepository.save(cart);
    }

    @Override
    public String removeFromCart(UUID cartId) {
        cartRepository.deleteById(cartId);
        return "Item Deleted";
    }

    @Override
    public String clearCart(UUID userId) {
        User user = userRepository.findById(userId).orElseThrow();
        cartRepository.deleteByUserId(user);
        return "Cart Cleared";
    }

    @Override
    public List<Cart> getAllCart(UUID userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return cartRepository.findAllByUserId(user);
    }
}
