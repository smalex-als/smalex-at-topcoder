package p500.srm585;// BEGIN CUT HERE

// END CUT HERE

public class EnclosingTriangleColorful {
  public int getNumber(int m, int[] x, int[] y) {
    int res = 0;
    for (int i = 0; i < 100000000; i++) {
      res++;
    }
    return res;
  }

// BEGIN CUT HERE
  public static void main(String[] args) {
    try {
            eq(0,(new EnclosingTriangleColorful()).getNumber(4, new int[] { 1, 2, 3 }, new int[] { 1, 3, 2 }),8);
            eq(1,(new EnclosingTriangleColorful()).getNumber(7, new int[] { 1, 1, 6, 6 }, new int[] { 1, 6, 1, 6 }),0);
            eq(2,(new EnclosingTriangleColorful()).getNumber(4, new int[] { 2 }, new int[] { 2 }),72);
            eq(3,(new EnclosingTriangleColorful()).getNumber(10, new int[] { 2, 6, 7, 6 }, new int[] { 7, 7, 9, 3 }),52);
            eq(4,(new EnclosingTriangleColorful()).getNumber(15, new int[] { 7, 6, 5, 4, 3 }, new int[] { 1, 4, 7, 10, 13 }),150);
            eq(5,(new EnclosingTriangleColorful()).getNumber(300, new int[] { 117, 183, 181, 118, 132, 128, 184, 150, 168, 121, 
                 179, 132, 168, 182, 119, 117, 180, 120, 175, 177, 
                 116, 175, 128, 163, 181, 178, 123, 118, 172, 143, 
                 163, 157, 179, 122, 121, 119, 157, 122, 150, 180, 
                 137, 177, 125, 123, 172, 125, 137, 143, 120, 178 }
               , new int[] { 157, 157, 132, 163, 181, 180, 150, 116, 181, 125, 
                 125, 119, 119, 163, 132, 143, 172, 172, 179, 178, 
                 150, 121, 120, 118, 168, 123, 178, 137, 120, 117, 
                 182, 117, 175, 177, 175, 168, 183, 123, 184, 128, 
                 118, 122, 179, 122, 180, 121, 182, 183, 128, 177 }
               ),21690886);
    } catch( Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
  private static void eq( int n, int a, int b ) {
    if ( a==b )
      System.err.println("Case "+n+" passed.");
    else
      System.err.println("Case "+n+" failed: expected "+b+", received "+a+".");
  }
  private static void eq( int n, char a, char b ) {
    if ( a==b )
      System.err.println("Case "+n+" passed.");
    else
      System.err.println("Case "+n+" failed: expected '"+b+"', received '"+a+"'.");
  }
  private static void eq( int n, long a, long b ) {
    if ( a==b )
      System.err.println("Case "+n+" passed.");
    else
      System.err.println("Case "+n+" failed: expected \""+b+"L, received "+a+"L.");
  }
  private static void eq( int n, boolean a, boolean b ) {
    if ( a==b )
      System.err.println("Case "+n+" passed.");
    else
      System.err.println("Case "+n+" failed: expected "+b+", received "+a+".");
  }
  private static void eq( int n, String a, String b ) {
    if ( a != null && a.equals(b) )
      System.err.println("Case "+n+" passed.");
    else
      System.err.println("Case "+n+" failed: expected \""+b+"\", received \""+a+"\".");
  }
  private static void eq( int n, int[] a, int[] b ) {
    if ( a.length != b.length ) {
      System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
      return;
    }
    for ( int i= 0; i < a.length; i++)
      if ( a[i] != b[i] ) {
        System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
        print( b );
        print( a );
        return;
      }
    System.err.println("Case "+n+" passed.");
  }
  private static void eq( int n, long[] a, long[] b ) {
    if ( a.length != b.length ) {
      System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
      return;
    }
    for ( int i= 0; i < a.length; i++ )
      if ( a[i] != b[i] ) {
        System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
        print( b );
        print( a );
        return;
      }
    System.err.println("Case "+n+" passed.");
  }
  private static void eq( int n, String[] a, String[] b ) {
    if ( a.length != b.length) {
      System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
      return;
    }
    for ( int i= 0; i < a.length; i++ )
      if( !a[i].equals( b[i])) {
        System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
        print( b );
        print( a );
        return;
      }
    System.err.println("Case "+n+" passed.");
  }
  private static void print( int a ) {
    System.err.print(a+" ");
  }
  private static void print( long a ) {
    System.err.print(a+"L ");
  }
  private static void print( String s ) {
    System.err.print("\""+s+"\" ");
  }
  private static void print( int[] rs ) {
    if ( rs == null) return;
    System.err.print('{');
    for ( int i= 0; i < rs.length; i++ ) {
      System.err.print(rs[i]);
      if ( i != rs.length-1 )
        System.err.print(", ");
    }
    System.err.println('}');
  }
  private static void print( long[] rs) {
    if ( rs == null ) return;
    System.err.print('{');
    for ( int i= 0; i < rs.length; i++ ) {
      System.err.print(rs[i]);
      if ( i != rs.length-1 )
        System.err.print(", ");
    }
    System.err.println('}');
  }
  private static void print( String[] rs ) {
    if ( rs == null ) return;
    System.err.print('{');
    for ( int i= 0; i < rs.length; i++ ) {
      System.err.print( "\""+rs[i]+"\"" );
      if( i != rs.length-1)
        System.err.print(", ");
    }
    System.err.println('}');
  }
  private static void nl() {
    System.err.println();
  }
// END CUT HERE
}

