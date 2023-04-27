import annotations.*;

public class CustomSort {

	@sortController(type="insertion")
	double[] nums = {1,-3,-1,5,-100,12,-13};
	
/*	@sortController(type="bubble")
	double[] nums2 = {1,-3,-1,5,-100,12,-13};
	
	@sortController(type="insertion")
	double[] nums3 = {1,-3,-1,5,0,12,-13};*/
	
	@invokeController(invoke=true)
	public void print_list(){
		
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
	}
	

}
