/*
需要注意字符输入流的read()返回值为int类型，如果想获取字符，就必须强转

 */


import java.io.FileReader;
import java.io.FileWriter;

public class Exercise3 {
    public static void main(String[] args)throws Exception {
        FileReader in=new FileReader("将进酒.txt");
        FileWriter out =new FileWriter("副本将进酒.txt");
        int p=0;
        char [] a=new char[1024];
        long begin=System.currentTimeMillis();
        while((p=in.read(a))!=-1) {
            out.write(a,0,p);
        }
        long end=System.currentTimeMillis();
        System.out.println("花费的时间"+(end-begin)+"毫秒");
        in.close();
        out.close();
    }
}
