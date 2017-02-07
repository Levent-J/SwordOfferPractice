package com.levent_j.Exercise_18;

/**
 * Created by levent_j on 17-2-7.
 */
public class Exercise_18 {
    public boolean HasSubTree(TreeNode rootA,TreeNode rootB){
        boolean result = false;
        if (rootA!=null&&rootB!=null){
            if (rootA.value==rootB.value){
                result = isRootAHasRootB(rootA,rootB);
            }
            if (!result){
                result = isRootAHasRootB(rootA.left,rootB);
            }
            if (!result){
                result = isRootAHasRootB(rootA.right,rootB);
            }
        }
        return result;
    }

    public boolean isRootAHasRootB(TreeNode rootA,TreeNode rootB) {
        if (rootB==null){
            return true;
        }
        if (rootA==null){
            return false;
        }
        if (rootA.value!=rootB.value){
            return false;
        }
        return (isRootAHasRootB(rootA.left,rootB.left))&&(isRootAHasRootB(rootA.right,rootB.right));
    }
}
