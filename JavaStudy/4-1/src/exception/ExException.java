package exception;

import java.util.Scanner;

public class ExException {
	
	private static final int CONST_EXCEPTION_TRIGER_NULL = 1;
	
	private static final int CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS = 2;
	
	private static final int CONST_EXCEPTION_TRIGER_CAST =3;
	
	private static final Object CONST_OBJ_FOR_CLASS_CAST =100;
	
	private static final String CONST_COMMON_INIT_INFO = "\n■3-3-4:ExException 入力値「1: 続行」／「-1: 終了」";
	
    private static final String CONST_COMMON_TASK_INPUT_NAME = "以下の例外を発生させるためのパラメーター（1〜3）のいずれかを入力してください。\n・1: NullPointerException\n・2: ArrayIndexOutOfBoundsException\n・3: ClassCastException";
    
    private static final String CONST_COMMON_MSG_ERROR_EXCEPTION = "エラー: 入力値が不正です。";
    
    private static final String CONST_MSG_NOT_EXCEPTION_TRIGGER = "例外の発生しないパラメーターです。";
    
    private static final String CONST_MSG_NULLPO = "ヌルポです。";
    
    
    public static void main(String[] args) {
    	
    	int parameter;
    	
    	int retryCounter =0;
    	
    	Scanner sc;
    	
    	do {
    		
    		System.out.println(CONST_COMMON_INIT_INFO);
    		
            sc = new Scanner(System.in);
            
            try {
            	
            	final int execute = sc.nextInt();
            	
            	if (execute == -1) break;
            	
            	if (execute != 1) {
            		
            		System.out.println(CONST_COMMON_MSG_ERROR_EXCEPTION);
            		
            		continue;
            	}
            	
            	System.out.println(CONST_COMMON_TASK_INPUT_NAME);
            	
            	parameter = sc.nextInt();
            	
            	switch (parameter) {
            	
            	case CONST_EXCEPTION_TRIGER_NULL:
            		
            	if (parameter != 1);
            		
            	 NullPo();
            	 
            	break;
            	
            	case CONST_EXCEPTION_TRIGER_ARRAY_OUT_OF_BOUNDS:
            		
            	if (parameter != 2);
            		
            	int[] arrayNumbers = {1,2,3};
            	
            	System.out.println(arrayNumbers[5]);
            	
            	break;
            	
            	case CONST_EXCEPTION_TRIGER_CAST:
            		
                 String castedStrValue = (String) CONST_OBJ_FOR_CLASS_CAST;
                    
                    System.out.println(castedStrValue);
                    
                 break;
                    
                 default:
                    	
                    System.out.println(CONST_MSG_NOT_EXCEPTION_TRIGGER);
                    
                 break;
            	
            	}
            	
            } catch (NullPointerException e) {
            	
            	printException(e);
            	
            } catch (ArrayIndexOutOfBoundsException e) {
            	
            	printException(e);
            	
            } catch (ClassCastException e) {
            	
            	printException(e);
            	
			} finally {
            	
            	System.out.println("リトライ回数=" + retryCounter++);
            }
    	} while (true);
    	
    	sc.close();
    	
    	System.out.println("お疲れ様でした!");
    	
    	}
    
    private static void NullPo() throws NullPointerException{
    	
    	throw new NullPointerException(CONST_MSG_NULLPO);
    	
    }
    
    private static void printException(final Exception e) {
    	
    	System.out.println(e);
    }
}