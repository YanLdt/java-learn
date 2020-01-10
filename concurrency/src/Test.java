/**
 * @Author: YanL
 * @Time: 15:43 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Test {
    public static void main(String[] args){

        // 打印1~1000所有的奇数
        new Thread(new Runnable(){@Override
            public void run(){

                for(int i=1;i<1000;i+=2){

                    try { Thread.sleep(100); } catch (Exception e) { e.printStackTrace(); }
                    System.out.println("odd:"+i);

                }

            }

        }).start();

        // 打印1~1000所有的偶数
        new Thread(new Runnable(){

            public void run(){

                for(int i=2;i<=1000;i+=2){

                    try { Thread.sleep(100); } catch (Exception e) { e.printStackTrace(); }
                    System.out.println("even:"+i);

                }
            }

        }).start();

    }
}
