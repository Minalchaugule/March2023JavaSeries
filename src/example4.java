
public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=19, j=29, k;
 k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
System.out.println("i="+i);
System.out.println("j="+j);
System.out.println("k="+k);


int m = 0, n = 0;
int p = --m * --n * n-- * m--;
System.out.println(p);


int a=1;
a = a++ + ++a * --a - a--;
System.out.println(a);

//int b = 11++;
//System.out.println(b);



int ch = 'A';
System.out.println(ch++);

char ch1 = 'A';
System.out.println(++ch1);

double d = 1.5, D = 2.5;

System.out.println(d++ + ++D);

}
}