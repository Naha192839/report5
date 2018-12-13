package jp.ac.uryukyu.ie.e185701;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        enemy.attack(hero);
//               for (int i = 0; i < 10; i++) {
//                   if (enemy.getDead()==false) {
//                       enemy.attack(hero);//乱数で0ダメージとなることもあるため、複数回実行してみる。
//                   }
        assertEquals(heroHP,hero.getHitPoint());
    }
}