package com.stevencat.designpatterntalks.adapter;

import java.util.List;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    /**
     * 适配逻辑
     *
     * @param list
     */
    @Override
    public void newMethod(List<String> list) {
        System.out.println("Into adapt logic, params: " + list);

        if (list.size() != 3) {
            throw new IllegalArgumentException();
        }

        String one = list.get(0);
        long two = Long.parseLong(list.get(1));
        double three = Double.parseDouble(list.get(2));
        adaptee.oldMethod(one, two, three);
    }
}
