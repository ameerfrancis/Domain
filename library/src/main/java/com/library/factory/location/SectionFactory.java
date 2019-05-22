package com.library.factory.location;

import com.library.domain.location.Section;

public class SectionFactory {

    public static Section getSection(String sectionName) {
        return new Section.Builder().sectionName(sectionName)
                .build();
    }
}
