package com.cmdi.check.serviceImpl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 单进程方式启动dubbo
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	com.alibaba.dubbo.container.Main.main(args);
    }
}
