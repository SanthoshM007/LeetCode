String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i+=1){
            arr[i]=Integer.toBinaryString(nums[i]);
        }
        String t="";
        int it=0,jt=0;

        while(true){
            int f=0;
        for(int i=0;i<nums.length-1;i++){
            t="";
            it=0;
            jt=0;
                if(Integer.parseInt(arr[i],2)>Integer.parseInt(arr[i+1],2)){
                    it=fun(arr[i]);
                    jt=fun(arr[i+1]);
                    if(it==jt){
                    t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    f=1;
                    }
                }
        }
        if(f==0) break;
        }

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            //System.out.println(nums[i]+" "+Integer.toBinaryString(nums[i]));
            if(nums[i]!=Integer.parseInt(arr[i],2)) return false;
        }
            
        
        return true;
    }
    public static int fun(String k){
        int s=0;
        for(int i=0;i<k.length();i++){
            if(k.charAt(i)=='1') s+=1;
            
        }
        return s;
    }
