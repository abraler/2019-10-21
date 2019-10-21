/*
I/O流提供了两个带缓存的字节流，分别是BufferedInputStream和BufferedOutputStream
他们的构造方法分别接收FileInputStream和FileOutputStream类型的参数作为对象，在读取数据
时提供缓冲功能
具体步骤如下
     ----- 应用程序缓冲流字节流的关系.png

 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exercise1 {
    public static void main(String[] args) throws Exception{
        //下面的就是格式
        BufferedInputStream in=new BufferedInputStream   (new FileInputStream("zrn.jpg"));
        BufferedOutputStream out=new BufferedOutputStream  (new FileOutputStream("zrn1.jpg"));
        int i=0;
        long begin=System.currentTimeMillis();
        while((i=in.read())!=-1){
            out.write(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("时间"+(end-begin)+"毫秒");
        in.close();
        out.close();
    }
}
