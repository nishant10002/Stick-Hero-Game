package com.example.game;

import org.junit.Test;

public class TestClass {
//    @Test
//    public void comparePlatformCherries(){
//        StickHeroGame stickHeroGame=  new StickHeroGame();
//        List<StickHeroGame.Platform> platforms = stickHeroGame.platforms;
//        List<StickHeroGame.Cherry> cherriesList = stickHeroGame.cherries;
//
//        //assertTrue(platforms.size()>cherriesList.size());
//
//        assertTrue(stickHeroGame.getPlatformTotal()>stickHeroGame.getCherriesTotal());
//    }
//}
//
//import com.example.game.StickHeroGame;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class StickHeroGameTest {
@Test
public void testGameInitialization() {
    StickHeroGame stickHeroGame = new StickHeroGame();

    org.junit.Assert.assertNull(stickHeroGame.platforms);
    org.junit.Assert.assertNull(stickHeroGame.cherries);
    org.junit.Assert.assertNull(stickHeroGame.bridges);
//    org.junit.Assert.assertEquals(0, stickHeroGame.platforms.size());
//    org.junit.Assert.assertEquals(0, stickHeroGame.cherries.size());
}


    @Test
    public void testPlatformSizeGreaterThanCherrySize() {
        StickHeroGame stickHeroGame = new StickHeroGame();

        // Initialize platforms and cherries (assuming your game class has the necessary methods)
        stickHeroGame.platforms = stickHeroGame.generateRandomPlatforms(5);
        stickHeroGame.cherries = stickHeroGame.generateRandomCherries();

        int platformSize = stickHeroGame.platforms.size();
        int cherrySize = stickHeroGame.cherries.size();

        org.junit.Assert.assertTrue("Platform size should be greater than Cherry size",platformSize > cherrySize);
    }
//    @Test
//    public void testCherryGenerationBetweenPlatforms() {
//        StickHeroGame stickHeroGame = new StickHeroGame();
//
//        stickHeroGame.platforms = stickHeroGame.generateRandomPlatforms(5);
//        stickHeroGame.cherries = stickHeroGame.generateRandomCherries();
//
//        for (StickHeroGame.Cherry cherry : stickHeroGame.cherries) {
//            boolean isBetweenPlatforms = stickHeroGame.platforms.stream()
//                    .anyMatch(platform -> cherry.getX() >= platform.getX()
//                            && cherry.getX() <= platform.getX() + platform.getWidth());
//            org.junit.Assert.assertTrue( "Cherry should be between platforms",isBetweenPlatforms);
//        }
//    }
//

}
