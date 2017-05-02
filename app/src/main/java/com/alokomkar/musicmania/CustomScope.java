package com.alokomkar.musicmania;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by aditlal on 24/11/16.
 */

/*
Annotation processor component class for custom scope for our components and module
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}
