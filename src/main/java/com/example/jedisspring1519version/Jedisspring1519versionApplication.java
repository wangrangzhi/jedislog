package com.example.jedisspring1519version;


import redis.clients.jedis.Jedis;

public class Jedisspring1519versionApplication {

    public static void main(String[] args) {
        Jedis jedis = new Jedis ("localhost",6379);
        System.out.println(jedis.dbSize());
        jedis.set("sd","sv");
        System.out.println( jedis.get("sd"));
    }

}
