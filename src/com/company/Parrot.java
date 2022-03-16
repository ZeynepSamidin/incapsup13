package com.company;

public class Parrot {
   String color;
   double weight;

   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public double getWeight() {
      return weight;
   }
   public void setWeight(int weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return "Parrot{" +
              "color='" + color + '\'' +
              ", weight=" + weight +
              '}';
   }
}
