package com.example.retry.predicate;


import com.example.retry.exception.MovieNotFoundException;

import java.util.function.Predicate;

public class ExceptionPredicate implements Predicate<Throwable> {
    @Override
    public boolean test(Throwable throwable) {
        System.out.println("Exception predicate is called.");
        return throwable instanceof MovieNotFoundException;
    }
}