package new_IO;
import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
public class NIOFileChannelDemo {
	public static void main(String [] args){   //p30
		File f = new File("");
		try(
				FileChannel inChannel = new FileInputStream(f).getChannel();
				FileChannel outChannel = new FileOutputStream("").getChannel()
				){
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			Charset charset = Charset.forName("GBk"); //使用GBK字符集创建解码器
			outChannel.write(buffer);
			buffer.clear();
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer);
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
