package me.vickychijwani.spectre.network;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

import me.vickychijwani.spectre.model.GsonExclude;

/* package */ class AnnotationExclusionStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        return f.getAnnotation(GsonExclude.class) != null;
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }

}
