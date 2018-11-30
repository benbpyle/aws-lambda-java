package com.binaryheap.lambdatest.services;
import com.binaryheap.lambdatest.models.Score;

public interface IScoreService {
    void RecordScore(Score score);
}
