package com.driver;

public class Main {
    public static class Product{
        public Product(){
        }

        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String args[]){
        Product p = new Product();
        int ans1 = p.product(2, 5);
        int ans2 = p.product(3,5,7);
        double ans3 = p.product(2.56, 5.48);
    }
}