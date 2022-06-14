public class Helpers {
  public void inputAndOutput(String args) {
    System.out.println(args);
  }

  public void headerAndFoot(String firstArg, String secondArg, String type) {
    String newLine = System.getProperty("line.separator");
    String isHeader = "";
    String isHeaderNewLine = "";

    if (type == "header") {
      isHeader = "Selamat Datang : " + secondArg;
      isHeaderNewLine = newLine;
    } else {
      isHeader = "";
      isHeaderNewLine = "";
    }

    inputAndOutput(
          ""
        + newLine
        + "Stok Gudang" + firstArg + "Barang"
        + newLine
        + "##########################"
        + newLine + newLine
        + isHeader
        + isHeaderNewLine
        );
  }
}
