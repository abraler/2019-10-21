/*
BufferedWriter 中有一个重要的方法
readLine()  该方法用于一次读取一行文本
newLine()-- 换行符
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise4 {
    public static void main(String[] args)throws Exception {
        BufferedReader in= new BufferedReader(new FileReader("将进酒.txt"));
        BufferedWriter out=new BufferedWriter(new FileWriter("也是副本。txt"));
            String a=null;
            long begin=System.currentTimeMillis();
            while((a=in.readLine())!=null){
                out.write(a);
                out.newLine();
        }
        long end=System.currentTimeMillis();
        System.out.println("花费的时间"+(end-begin)+"毫秒");
        in.close();
        out.close();
    }
}
