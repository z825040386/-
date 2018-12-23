package com.atguigu.Dm;

public class Day19 {
         private String name;
         private double price;
         private String author;
         public int hashCode() {
			   final int prime = 31;
			   int result = 1;
			return result;
			   
        	 
         }
		@Override
		public String toString() {
			return "Day19 [name=" + name + ", price=" + price + ", author=" + author + "]";
		}
		public Day19(String name, double price, String author) {
			super();
			this.name = name;
			this.price = price;
			this.author = author;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
         
}
