package p500.srm534;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/23/12
 * Time: 9:10 PM
 */
public class EllysDirectoryListing {
  public String[] getFiles(String[] files) {
    if (isDone(files)) {
      return files;
    }
    replaceLast(files, 0);
    if (isDone(files)) {
      return files;
    }
    replaceLast(files, 1);
    return files;
  }

  private void replaceLast(String[] files, int offset) {
    for (int i = 0; i < files.length; i++) {
      String file = files[i];
      if (file.equals(".") || file.equals("..")) {
        String last = files[files.length - 1 - offset];
        files[files.length - 1 - offset] = file;
        files[i] = last;
        break;
      }
    }
  }

  private boolean isDone(String[] files) {
    return (files[files.length - 1].equals(".") || files[files.length - 2].equals(".")) &&
        (files[files.length - 1].equals("..") || files[files.length - 2].equals(".."));
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, new String[]{"ContestApplet.jnlp", "Movie.avi", "Image.jpg", "Book.pdf", "..", "." },
        new EllysDirectoryListing().getFiles(new String[]{"ContestApplet.jnlp", ".", "Image.jpg", "..", "Book.pdf", "Movie.avi"}));
    ExampleRunner.eq(1, new String[]{".", ".." },
        new EllysDirectoryListing().getFiles(new String[]{".", ".."}));
  }
}
