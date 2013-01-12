// BEGIN CUT HERE
package p400.srm405;

import static utils.ExampleRunner.eq;


// END CUT HERE
public class RelativePath {
  public String makeRelative(String path, String currentDir) {
    final String[] pathPieces = path.split("/");
    final String[] currentDirPieces = currentDir.split("/");
    int i;
    for (i = 0; i < pathPieces.length && i < currentDirPieces.length; i++) {
      if (!pathPieces[i].equals(currentDirPieces[i])) {
        break;
      }
    }
    String result = "";
    for (int j = i; j < currentDirPieces.length; j++) {
      result += "../";
    }
    for (int j = i; j < pathPieces.length; j++) {
      if (j != i && i > 0) {
        result += "/";
      }
      result += pathPieces[j];
    }
    return result;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new RelativePath()).makeRelative("/home/top/data/file", "/home/user/pictures"), "../../top/data/file");
      eq(1, (new RelativePath()).makeRelative("/home/user/movies/title", "/home/user/pictures"), "../movies/title");
      eq(2, (new RelativePath()).makeRelative("/file", "/"), "file");
      eq(3, (new RelativePath()).makeRelative("/a/b/a/b/a/b", "/a/b/a/a/b/a/b"), "../../../../b/a/b");
      eq(4, (new RelativePath()).makeRelative("/root/root/root", "/root"), "root/root");
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
