package com.github.ankurpathak.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedis {

    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");

        Jedis jedis = pool.getResource();
        jedis.set("notify", "umq");
        jedis.expire("notify", 10);

    }
}