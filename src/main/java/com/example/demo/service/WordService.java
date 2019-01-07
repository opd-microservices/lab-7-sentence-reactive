package com.example.demo.service;

import com.example.demo.domain.Word;

import rx.Observable;

public interface WordService {

	Observable<Word> getSubject();
	Observable<Word> getVerb();
	Observable<Word> getArticle();
	Observable<Word> getAdjective();
	Observable<Word> getNoun();	
	
}
