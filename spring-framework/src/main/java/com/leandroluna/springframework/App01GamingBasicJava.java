package com.leandroluna.springframework;

import com.leandroluna.springframework.game.GameRunner;
// import com.leandroluna.springframework.game.MarioGame;
import com.leandroluna.springframework.game.PacmanGame;
// import com.leandroluna.springframework.game.SuperContraGame;

// App01GamingBasicJava is the same as App02HelloWorldSpring, but using regular Java
public class App01GamingBasicJava {
    public static void main(String[] args) {
        
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }    
}
