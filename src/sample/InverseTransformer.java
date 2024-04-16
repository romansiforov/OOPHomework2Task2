package sample;

public class InverseTransformer extends TextTransformer{
	
	@Override
	public String transform(String text) {
		char [] textChars = text.toCharArray();
		char [] tmp = new char[textChars.length];
		for(int i = 0; i < textChars.length; i++) {
			tmp[i] = textChars[textChars.length -1 - i];
		}
		return String.valueOf(tmp);
	}
	


}
