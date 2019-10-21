//之前的是字节流，下面是字符流
/*
所谓字符流顾名思义按字符一个一个往里面读
我是这样理解的，字节流就是读取这种相当于照片的复制
而字符流就是适应 汉字这样的一个字符一个字符的读入
字符流和字节流两个很像
很多子类都是成对出现的
FileReader 和  FileWriter  来读取文件
BufferedReader 和 BufferedWriter  具有缓冲功能的流可以提高效率
 */
/*
下面这个程序我想测试一下是否是按字符读取的
 */
import java.io.FileReader;

public class Exercise2 {
    public static void main(String[] args)throws Exception {
        FileReader in=new FileReader("将进酒.txt");
        int n=0;
        int s=0;
        while((n=in.read())!=-1){
            s++;
            System.out.print((char)n);
        }
        System.out.println(s);
        in.close();
    }
}
