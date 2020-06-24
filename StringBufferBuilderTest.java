public class StringBufferBuilderTest{
	public static void main(String[] args){
		StringBuffer buffer= new StringBuffer("Buffer ");
		buffer.append(" append");
		System.out.println(buffer);
		buffer.replace(0,buffer.length(),"Buffer replaced");
		System.out.println(buffer);

		StringBuilder builder= new StringBuilder("builder");
		builder.append(" append");
		System.out.println(builder);
		builder.replace(0,builder.length(),"builder replaced");
		System.out.println(builder);

	}
}
