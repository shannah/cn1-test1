package com.github.shannah.cn1test1;

import com.codename1.system.Lifecycle;
import com.codename1.ui.Button;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose
 * of building native mobile applications using Java.
 */
public class Cn1Test1 extends Lifecycle {
    @Override
    public void runApp() {
        Form hi = new Form("Hi World", BoxLayout.y());
        Button helloButton = new Button("Hello World");
        hi.add(helloButton);
        helloButton.addActionListener(e -> hello());
        hi.getToolbar().addMaterialCommandToSideMenu("Hello Command",
        FontImage.MATERIAL_CHECK, 4, e -> hello());
        hi.show();
    }

    private void hello() {
        Dialog.show("Hello Codename One", "Welcome to Codename One", "OK", null);
    }

}
