package com.endomondo.project.page.object;

abstract class BasePage {

    void sleep() {
        sleep(1000);
    }

    void sleep(Integer time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
