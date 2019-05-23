package com.admin.task_core.delegate.bottom;

/**
 * @description: ${DESCRIPTION}
 */
public class BottomTabBean {

    private final CharSequence ICON ;
    private final CharSequence TITLE ;

    public BottomTabBean(CharSequence icon, CharSequence title) {
        this.ICON = icon;
        this.TITLE = title;
    }

    public CharSequence getIcon() {
        return ICON;
    }

    public CharSequence getTitle() {
        return TITLE;
    }
}