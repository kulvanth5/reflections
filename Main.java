import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

import annotations.*;
import algorithms.*;

public class Main{
	
	public String execute() throws Throwable {
	 
		Class<CustomSort> controller = CustomSort.class;
		Object sort_obj = controller.newInstance();
		//Annotation[] annotations = controller.getDeclaredAnnotations();
		//boolean restController = controller.isAnnotationPresent(RestController.Class);
		
			Field[] fields = controller.getDeclaredFields();
			
			for(Field field : fields){
			
				sortController sc = field.getAnnotation(sortController.class);

				if(sc != null){
				
				Object data = field.get(sort_obj);
				double[] arr=(double[])(data);
				
				String strategy = sc.type();
				
				Sorter obj = new Sorter();
				arr = obj.sorter(arr,strategy);

				field.set(sort_obj,arr);
			}
		}	
				Method[] methods = controller.getMethods();
				
				for(Method method : methods) {
					//boolean requestMapping = method.isAnnotationPresent(ResquestMapping.Class)
					invokeController ic = method.getAnnotation(invokeController.class);
					//Object data = method.get(sort_obj);
					//double[] arr=(double[])(data);
					
					if ( ic != null && ic.invoke())
					{
							method.invoke(sort_obj);
					}
					
					}
				
					return null;
				}	

	public static void main(String... args){
		try{
		new Main().execute();
		} catch (Throwable e){

		}

		
	}
}
	

