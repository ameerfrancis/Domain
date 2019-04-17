package com.library.factory;

import com.library.domain.Library;
import com.library.domain.Section;

public class SectionFactory {

    public static Section getSection(String sectionName) {
        return new Section.Builder().sectionName(sectionName)
                .build();
    }
}
