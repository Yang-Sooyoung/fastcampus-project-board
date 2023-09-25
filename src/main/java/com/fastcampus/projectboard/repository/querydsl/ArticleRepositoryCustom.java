package com.fastcampus.projectboard.repository.querydsl;

import java.util.List;

public interface ArticleRepositoryCustom {
    public abstract List<String> findAllDistinctHashtags();
}
