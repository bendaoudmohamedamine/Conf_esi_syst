package com.esi.conf_esi.service;

import com.esi.conf_esi.entity.Article;
import com.esi.conf_esi.entity.Review;
import com.esi.conf_esi.repos.ArticleRepo;
import com.esi.conf_esi.repos.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepo reviewRepo ;
    @Autowired
    private ArticleRepo articleRepo ;
    public void saveReview (Review review){
        reviewRepo.save(review);
    }
    public void editReview (Review review){
        reviewRepo.save(review);
    }
    public void deleteReview (UUID id){
        reviewRepo.deleteById(id);
    }
    public void getRev (UUID id){
        reviewRepo.getOne(id);
    }
    public Review findByDate (Date date){
        return reviewRepo.findByReviewDate(date);
    }
    public List<Review> getReviewsOfArticle (UUID id){
        Article article  = articleRepo.getOne(id);
        return (List)article.getReviews() ;
    }


}
