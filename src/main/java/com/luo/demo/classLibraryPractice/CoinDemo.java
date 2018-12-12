package com.luo.demo.classLibraryPractice;

import java.util.Random;

/**
 * @author：罗金星 date 2018/11/26 10:58
 **/
class Coin{//模拟硬币扔的操作
    private int front ;//正面
    private int back;//反面

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    private Random random=new Random();
    public void throwCoin(int num ){
      for (int x=0;x<num;x++){
          int temp=(random.nextInt())%2;
          if(temp==0){
              front++;
          }else {
              back++;
          }

      }
    }
}
public class CoinDemo {
    public static void main(String[] args) {
        Coin coin=new Coin();
        coin.throwCoin(1000);
        System.out.println("正："+coin.getFront()+"反："+coin.getBack());
    }
}
