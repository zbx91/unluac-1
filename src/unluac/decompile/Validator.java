package unluac.decompile;

public class Validator {

	public static void process(Decompiler d) {
		Code code = d.code;
		for(int line = 1; line <= code.length; line++) {
			switch(code.op(line)) {
				case EQ: {
					AssertionManager.assertCritical(
						line + 1 <= code.length && code.op(line + 1) == Op.JMP,
						"ByteCode validation failed; EQ instruction is not followed by JMP"
					);
				}
				case LT: {
					
				}
			}
		}
	}
	
	//static only
	private Validator() {}
	
}
