public class SpreadsheetHandler extends DocumentHandler{


    public SpreadsheetHandler(DocumentHandler handler) {
        super(handler);
    }


    public void openDocument(String fileExtension){

        if (fileExtension.equals("xlxs")){
            System.out.println("Opening Spreadsheet Document....");
        } else {
            super.openDocument(fileExtension);
        }

    }

}
