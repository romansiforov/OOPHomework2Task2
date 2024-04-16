package sample;

public class UpDownTransformer extends TextTransformer{
	@Override
	public String transform(String text) {
		char[] textChars = text.toCharArray();
		
		for(int i = 0; i< textChars.length; i++) {
			if(i % 2 ==0) {
				textChars[i] = Character.toUpperCase(textChars[i]);
			}
		}
		
		return String.valueOf(textChars);
	}
}
