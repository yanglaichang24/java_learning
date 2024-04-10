package com.ylch.test.jdk_class_test.compare;

/**
 * @author Mr.Yang
 * @desc CompareBeam
 * @date 2023/5/15 16:37
 */
public class CompareBean implements Comparable<CompareBean>{

    int index = 0;

    public CompareBean(int index){
        this.index = index;
    }

//    @Override
//    public int compareTo(CompareBean o) {
//        return Integer.valueOf(o.index).compareTo(Integer.valueOf(this.index));
//    }

    @Override
    public int compareTo(CompareBean o) {
        int i = Integer.valueOf(this.index).compareTo(o.index);
        System.out.println("this = "+ this + " ,o = "+o+", val = "+ i);
        return i;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "CompareBean{" +
                "index=" + index +
                '}';
    }
}
