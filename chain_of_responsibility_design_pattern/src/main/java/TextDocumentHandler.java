public class TextDocumentHandler extends DocumentHandler{


    public TextDocumentHandler(DocumentHandler handler) {
        super(handler);
    }

    public void openDocument(String fileExtension){

        if (fileExtension.equals("txt")){
            System.out.println("Opening Text Document....");
        } else {
            super.openDocument(fileExtension);
        }

    }

}
