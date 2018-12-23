package day23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class IOStream {

//	分别使用节点流：FileInputStream、FileOutputStream和
//	缓冲流：BufferedInputStream、BufferedOutputStream实现文本文件/图片/视频文件的复制。
//	并比较二者在数据复制方面的效率
	 @Test
	    public void test1() {
	    	FileOutputStream fos = null;
	    	ObjectOutputStream oos = null;
	    	try {
				fos = new FileOutputStream("50个随机数");
				oos = new ObjectOutputStream(fos);
				for(int i=0;i<50;i++) {
					int val = (int)(Math.random()*100);
					oos.writeInt(val);
				}
			} catch (Exception e) {
				e.getStackTrace();
			}finally {
				if(oos != null) {
					try {
						oos.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
	    }
	@Test
	public void ever4() {
		long start = System.currentTimeMillis();
		FileInputStream fs = null;
		FileOutputStream fo = null;
		try {
			fs = new FileInputStream("1_考试和复习.avi");
			fo = new FileOutputStream("复习.avi");
			int len;
			byte[] by = new byte[1024];
 			while((len = fs.read(by))!=-1) {
 				fo.write(by,0,len);
 			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fo!=null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fs!=null) {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("节点流程序运行的时间是"+(endtime-start));
		
		
		
		long start1 = System.currentTimeMillis();
		FileInputStream fs1 = null;
		FileOutputStream fo1 = null;
		BufferedInputStream bs = null;
		BufferedOutputStream bo = null;
		try {
			fs1 = new FileInputStream("1_考试和复习.avi");
			fo1 = new FileOutputStream("复习1.avi");
			bs = new BufferedInputStream(fs1);
			bo = new BufferedOutputStream(fo1);
			int len;
			byte[] b = new byte[100];
 			while((len = bs.read(b))!=-1) {
 				bo.write(b, 0, len);
 			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fo!=null) {
				try {
					bs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fs!=null) {
				try {
					bo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		long endtime1 = System.currentTimeMillis();
		System.out.println("缓冲流程序运行的时间是"+(endtime1-start1));
		
	}
	
	@Test
	public void ever3() {
		long start = System.currentTimeMillis();
		FileInputStream fs = null;
		FileOutputStream fo = null;
		try {
			fs = new FileInputStream(".mp3");
			fo = new FileOutputStream("做我的小猫.map3");
			int len;
			byte[] by = new byte[1024];
 			while((len = fs.read(by))!=-1) {
 				fo.write(by,0,len);
 			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fo!=null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fs!=null) {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("节点流程序运行的时间是"+(endtime-start));
		
	}
//	使用对象输出流写一个二进制文件, 写入随机个随机的100以内的整数. writeInt(..)
//	使用对象输入流把全部整数读出来,并打印输出.
	@Test
	public void ever1() {
		FileInputStream fw = null;				
		BufferedInputStream bw = null;
		ObjectInputStream ow = null;

		try {
			fw = new FileInputStream("0-1000randoms");
			bw = new BufferedInputStream(fw);
			ow = new ObjectInputStream(bw);
			int read = ow.readInt();
			while(true) {
	
				System.out.println(read+" ");
				/*try {
					read = ow.readInt();
					
				} catch (Exception e) {
					System.out.println("打印结束");
					break;
				}*/
				
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ow != null) {
				try {
					ow.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void ever2() {
		FileOutputStream fw = null;
		BufferedOutputStream bw = null;
		ObjectOutputStream ow = null;

		try {
			fw = new FileOutputStream("0-1000randoms");
			bw = new BufferedOutputStream(fw);
			ow = new ObjectOutputStream(bw);
			int count = (int) (Math.random() * 100);
			for (int i = 0; i < count; i++) {
				int rom = (int) (Math.random() * 100);
				ow.writeInt(rom);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ow != null) {
				try {
					ow.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//	使用对象输出流写一个二进制文件, 写入50个随机的100以内的整数. writeInt(..)
//	使用对象输入流把这50个整数读出来,并打印输出.


	@Test
	public void ever() {
		FileInputStream fw = null;				
		BufferedInputStream bw = null;
		ObjectInputStream ow = null;

		try {
			fw = new FileInputStream("0-100random");
			bw = new BufferedInputStream(fw);
			ow = new ObjectInputStream(bw);
			int readUTF ;
			for(int i=0;i<50;i++) {
				readUTF = ow.readInt();
				System.out.print(readUTF+" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ow != null) {
				try {
					ow.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		FileOutputStream fw = null;
		BufferedOutputStream bw = null;
		ObjectOutputStream ow = null;

		try {
			fw = new FileOutputStream("0-100random");
			bw = new BufferedOutputStream(fw);
			ow = new ObjectOutputStream(bw);
			for (int i = 0; i < 50; i++) {
				int rom = (int) (Math.random() * 100);
				ow.writeInt(rom);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ow != null) {
				try {
					ow.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
