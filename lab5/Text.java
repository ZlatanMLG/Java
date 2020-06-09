import java.util.ArrayList;

public class Text extends Sentence {
    private String txt;

    Text(String txt) {
        super(txt);
        this.txt = txt;
    }

    ArrayList<Sentence> sentence = new ArrayList<Sentence>();
    ArrayList<Punctuation> punctuation = new ArrayList<Punctuation>();

    protected void ObjSplit() {
        int indexPunctuation = 0;
        for (String txt_iter : this.txt.split("\\.\n")) {
            this.sentence.add(new Sentence(txt_iter));
            indexPunctuation+=txt_iter.length();
            this.punctuation.add(new Punctuation(this.txt.charAt(indexPunctuation)));
            indexPunctuation++;
        }

    }
    protected void Execute(int dlin, String corr) {
        String words;
        String result = "";
        for (int i = 0; i < this.word.size(); i++) {
            words = this.word.get(i).getWord();
            if (words.length() == dlin) {
                words = corr;
            }
            result += words + " ";

        }
        System.out.print(result);
    }
}

