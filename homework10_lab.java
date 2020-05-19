package dom10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class MainClass {
	
	

	public static void main(String[] args) {
		boolean[] boolArr=new boolean[6];
		byte[] byteArr=new byte[6];
		char[] charArr=new char[6];
		short[] shortArr=new short[6];
		int[] intArr=new int[6];
		long[] longArr=new long[6];
		float[] floatArr=new float[6];
		double[] doubleArr=new double[6];
		String[] strArr=new String[6];
		
		Arrays.fill(boolArr,false);
		Arrays.fill(byteArr,(byte)1);
		Arrays.fill(charArr,'1');
		Arrays.fill(shortArr,(short)1);
		Arrays.fill(intArr,1);
		Arrays.fill(longArr,1);
		Arrays.fill(floatArr,1);
		Arrays.fill(doubleArr,1);
		Arrays.fill(strArr,"1");
		
		System.out.println("=====Array.fill()=====");
		System.out.println("Bool Array: "+Arrays.toString(boolArr));
		System.out.println("Byte Array: "+Arrays.toString(byteArr));
		System.out.println("Char Array: "+Arrays.toString(charArr));
		System.out.println("Short Array: "+Arrays.toString(shortArr));
		System.out.println("Int Array: "+Arrays.toString(intArr));
		System.out.println("Long Array: "+Arrays.toString(longArr));
		System.out.println("Float Array: "+Arrays.toString(floatArr));
		System.out.println("Double Array: "+Arrays.toString(doubleArr));
		System.out.println("String Array: "+Arrays.toString(strArr));
		
		Arrays.fill(boolArr,2,3,true);Arrays.fill(boolArr,4,6,false);
		Arrays.fill(byteArr,2,3,(byte)5);Arrays.fill(byteArr,4,6,(byte)3);
		Arrays.fill(charArr,2,3,'5');Arrays.fill(charArr,4,6,'3');
		Arrays.fill(shortArr,2,3,(short)5);Arrays.fill(shortArr,4,6,(short)3);
		Arrays.fill(intArr,2,3,5);Arrays.fill(intArr,4,6,3);
		Arrays.fill(longArr,2,3,5);Arrays.fill(longArr,4,6,3);
		Arrays.fill(floatArr,2,3,5);Arrays.fill(floatArr,4,6,3);
		Arrays.fill(doubleArr,2,3,5);Arrays.fill(doubleArr,4,6,3);
		Arrays.fill(strArr,2,3,"5");Arrays.fill(strArr,4,6,"3");
		
		System.out.println();
		System.out.println("=====Before Array.sort()=====");
		System.out.println("Bool Array: "+Arrays.toString(boolArr));
		System.out.println("Byte Array: "+Arrays.toString(byteArr));
		System.out.println("Char Array: "+Arrays.toString(charArr));
		System.out.println("Short Array: "+Arrays.toString(shortArr));
		System.out.println("Int Array: "+Arrays.toString(intArr));
		System.out.println("Long Array: "+Arrays.toString(longArr));
		System.out.println("Float Array: "+Arrays.toString(floatArr));
		System.out.println("Double Array: "+Arrays.toString(doubleArr));
		System.out.println("String Array: "+Arrays.toString(strArr));
		
		//Arrays.sort(boolArr);
		Arrays.sort(byteArr);
		Arrays.sort(charArr);
		Arrays.sort(shortArr);
		Arrays.sort(intArr);
		Arrays.sort(longArr);
		Arrays.sort(floatArr);
		Arrays.sort(doubleArr);
		Arrays.sort(strArr);
		
		System.out.println();
		System.out.println("=====After Array.sort()=====");
		System.out.println("Bool Array: "+Arrays.toString(boolArr));
		System.out.println("Byte Array: "+Arrays.toString(byteArr));
		System.out.println("Char Array: "+Arrays.toString(charArr));
		System.out.println("Short Array: "+Arrays.toString(shortArr));
		System.out.println("Int Array: "+Arrays.toString(intArr));
		System.out.println("Long Array: "+Arrays.toString(longArr));
		System.out.println("Float Array: "+Arrays.toString(floatArr));
		System.out.println("Double Array: "+Arrays.toString(doubleArr));
		System.out.println("String Array: "+Arrays.toString(strArr));
		
		Color[] col= {new Color(25), new Color(99), new Color(16), new Color(34), new Color(22), new Color(46)};
		ColorRectangle[] colrec= {new ColorRectangle(1,2,3,4,250), new ColorRectangle(5,6,7,8,99), new ColorRectangle(11,21,31,41,167), new ColorRectangle(31,32,33,34,146), new ColorRectangle(55,22,11,33,256), new ColorRectangle(9,13,28,51,121)};
		System.out.println();
		System.out.println("=====Before Array.sort() for Color and ColorRectangle=====");
		System.out.println("Color Array: "+Arrays.toString(col));
		System.out.println("ColorRectangle Array: "+Arrays.toString(colrec));
		
		Arrays.sort(col, new Comparator<Color>() {
		    @Override
		    public int compare(Color o1, Color o2) {
		        return ((int)o1.getCC()) - ((int)o2.getCC());
		    }
		});
		
		Arrays.sort(colrec, new Comparator<ColorRectangle>() {
		    @Override
		    public int compare(ColorRectangle o1, ColorRectangle o2) {
		        return (o1.calcArea()) - (o2.calcArea());
		    }
		});
		
		System.out.println();
		System.out.println("=====After Array.sort() for Color and ColorRectangle=====");
		System.out.println("Color Array: "+Arrays.toString(col));
		System.out.println("ColorRectangle Array: "+Arrays.toString(colrec));
		
		File fp = null;
		String data1="1 1 2 3 255";
		String data2="1 2 3 3 255";
		String data3="1 3 4 5 255";
		String data4="1 4 5 6 255";
		String data5="1 5 2 3 255";
		String data6="1 6 3 3 255";
		String data7="1 7 4 5 255";
		String data8="1 8 5 6 255";
		String data9="1 9 2 3 255";
		String data10="1 10 3 3 255";
		
		String fpName="D:/test/fp.txt";
		
		fp=new File(fpName);
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(fp, true))) {
			if(fp.exists()) {
				fp.createNewFile();
			}
			
			bw.write(data1);bw.flush();bw.newLine();
			bw.write(data2);bw.flush();bw.newLine();
			bw.write(data3);bw.flush();bw.newLine();
			bw.write(data4);bw.flush();bw.newLine();
			bw.write(data5);bw.flush();bw.newLine();
			bw.write(data6);bw.flush();bw.newLine();
			bw.write(data7);bw.flush();bw.newLine();
			bw.write(data8);bw.flush();bw.newLine();
			bw.write(data9);bw.flush();bw.newLine();
			bw.write(data10);bw.flush();
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RectangleArray ra=new RectangleArray(fpName);
		
		System.out.println();
		System.out.println("=====Before Array.sort() for RectangleArray=====");
		ra.printColl();
		
		ra.sortRC();
		System.out.println();
		System.out.println("=====After Array.sort() for RectangleArray=====");
		ra.printColl();
		
		System.out.println();
		System.out.println("RectangleArray Sum Area: "+ra.calcSumArea());
		
		System.out.println();
		System.out.println("RectangleArray Perimeter: "+ra.calcSumPerimeter());
	}

}






class Color implements Comparable<Object>{
	private long red, green, blue, rgb;
	
	private void setCombinedColor() {rgb = (256*256*red)+(256*256*green)+(256*256*blue);}
	public long getCC() { return rgb; }
	
	public Color() {red=0; green=0; blue=0; rgb=(256*256*red)+(256*256*green)+(256*256*blue);}
	public Color(long c) { blue=c; green=c; red=c; rgb=(256*256*red)+(256*256*green)+(256*256*blue);}
	
	public void setRed(long r) { red=r; }
	public void setGreen(long g) { green=g; }
	public void setBlue(long b) { blue=b; }
	
	public long getRed() { return red; }
	public long getGreen() { return green; }
	public long getBlue() { return blue; }
	
	public boolean equals(Object r) {
		if (this == r) return true;
		if (r==null||r.getClass()!=this.getClass()) return false;	
		Color color = (Color) r;
		return (color.red==this.red && color.green==this.green && color.blue==this.blue && color.rgb == this.rgb);
	}
	
	public int compareTo(Object r) {
		Color c=(Color)r;
		if(this.rgb==c.getCC()) {return 0;}
		else if(this.rgb>c.getCC()) {return 1;}
		else {return -1;}
	}
	
	public String toString() {return (" RGB:"+rgb);}
}

class ColorRectangle extends Color implements Comparable<Object>{
	private int iX1, iX2, iY1, iY2; Color col = new Color();
	
	public ColorRectangle() {iX1=0; iX2=0; iY1=0; iY2=0;}
	public ColorRectangle(int x1,int x2,int y1,int y2,long c) {super(c);iX1=x1; iX2=x2; iY1=y1; iY2=y2;}
	
	public void setX1(int i) {iX1=i;}
	public void setX2(int i) {iX2=i;}
	public void setY1(int i) {iY1=i;}
	public void setY2(int i) {iY2=i;}
	
	public int getX1() {return iX1;}
	public int getX2() {return iX2;}
	public int getY1() {return iY1;}
	public int getY2() {return iY2;}
	
	public int calcArea() {return ((Math.max(this.iX1, this.iX2)-Math.min(this.iX1, this.iX2))*(Math.max(this.iY1, this.iY2)-Math.min(this.iY1, this.iY2)));}
	
	public int compareTo(ColorRectangle rept) {
		if (this.calcArea() == rept.calcArea()) return 0;
		else if(this.calcArea() < rept.calcArea()) return 1;
		else return -1;
	}
	
	@Override
	public String toString() { return "Area: "+calcArea(); }
	public boolean equals(ColorRectangle r) {
        if(!(r instanceof ColorRectangle)) {
            return false;
        }
        ColorRectangle rect = r;
        return(this.calcArea()==rect.calcArea()&&this.getRed()==rect.getRed()&&this.getGreen()==rect.getGreen()&&this.getBlue()==rect.getBlue());
    }
	public void translateX(int iPoints) {
        this.iX1+=iPoints;
        this.iX2+=iPoints;
    }
    public void translateY(int iPoints) {
        this.iY1+=iPoints;
        this.iY2+=iPoints;
    }
    public void translate(int iPoints) {
        this.translateX(iPoints);
        this.translateY(iPoints);
    }
    
	public boolean isInside(int ptX, int ptY) { return(ptX > iX1 && ptX < iX2 &&  ptY > iY1 && ptY < iY2)?true:false; }	
	
	public ColorRectangle unionRect(ColorRectangle r) {
	    int x1= Math.min(Math.min(this.iX1,this.iX2),Math.min(r.getX1(), r.getX2()));
	    int x2= Math.max(Math.min(this.iX1,this.iX2),Math.max(r.getX1(), r.getX2()));
	    int y1= Math.min(Math.min(this.iY1,this.iY2),Math.min(r.getY1(), r.getY2()));
	    int y2= Math.max(Math.min(this.iY1,this.iY2),Math.max(r.getY1(), r.getY2()));
	    long RGBmix = 256*256*this.getRed()+256*this.getGreen()+1*this.getBlue();
	    return new ColorRectangle (x1,x2,y1,y2,RGBmix);
	}

	public ColorRectangle intersectionRect(ColorRectangle r) {
	    int x1=Math.min(this.iX1, r.iX2);
	    int x2=Math.max(this.iX1, r.iX2);
	    int y1=Math.min(this.iY1, r.iY2);
	    int y2=Math.max(this.iY1, r.iY2);
	    long RGBmix = 256*256*this.getRed()+256*this.getGreen()+1*this.getBlue();
	    return new ColorRectangle (x1,x2,y1,y2,RGBmix);
    }
	
}

class RectangleArray{
	ColorRectangle cr[]=new ColorRectangle[9];
	
	RectangleArray(String filename){
		BufferedReader reader;
		try{
			reader=new BufferedReader(new FileReader(filename));
			String line=reader.readLine();
			int i=0;
			while(i!=9) {
				String splitLine[]=line.split(" ");
				int x1=Integer.parseInt(splitLine[0]);
				int x2=Integer.parseInt(splitLine[1]);
				int y1=Integer.parseInt(splitLine[2]);
				int y2=Integer.parseInt(splitLine[3]);
				long c=Long.parseLong(splitLine[4]);
				ColorRectangle rec=new ColorRectangle(x1,x2,y1,y2,c);
				cr[i]=rec;
				i++;
				line=reader.readLine();
			}
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public ColorRectangle[] getCRArray() {return cr;}
	
	public void printColl() {System.out.println("RectangleArray: "+Arrays.toString(cr));}
	
	public double calcSumArea() {
		double res=0;
		for (int i = 0; i < cr.length; i++) {
			res=res+cr[i].calcArea();
		}
		return res;
	}
	
	public double calcSumPerimeter() {
		double oneP=0, totalP=0;
		for (int i = 0; i < cr.length; i++) {
			oneP=cr[i].getX1()+cr[i].getX2()+cr[i].getY1()+cr[i].getY2();
			totalP=totalP+oneP;
		}
		return totalP;
	}
	
	void sortRC() {
		Arrays.sort(cr, new Comparator<ColorRectangle>() {
		    @Override
		    public int compare(ColorRectangle o1, ColorRectangle o2) {
		        return (o1.calcArea()) - (o2.calcArea());
		    }
		});
	}
}


