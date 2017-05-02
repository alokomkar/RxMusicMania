package com.alokomkar.musicmania.music.model;

/**
 * Created by Alok on 26/04/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MusicVideoModel {

    @SerializedName("resultCount")
    @Expose
    private Integer resultCount;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public class Result {

        @SerializedName("wrapperType")
        @Expose
        private String wrapperType;
        @SerializedName("kind")
        @Expose
        private String kind;
        @SerializedName("artistId")
        @Expose
        private Integer artistId;
        @SerializedName("trackId")
        @Expose
        private Integer trackId;
        @SerializedName("artistName")
        @Expose
        private String artistName;
        @SerializedName("trackName")
        @Expose
        private String trackName;
        @SerializedName("trackCensoredName")
        @Expose
        private String trackCensoredName;
        @SerializedName("artistViewUrl")
        @Expose
        private String artistViewUrl;
        @SerializedName("trackViewUrl")
        @Expose
        private String trackViewUrl;
        @SerializedName("previewUrl")
        @Expose
        private String previewUrl;
        @SerializedName("artworkUrl30")
        @Expose
        private String artworkUrl30;
        @SerializedName("artworkUrl60")
        @Expose
        private String artworkUrl60;
        @SerializedName("artworkUrl100")
        @Expose
        private String artworkUrl100;
        @SerializedName("collectionPrice")
        @Expose
        private Double collectionPrice;
        @SerializedName("trackPrice")
        @Expose
        private Double trackPrice;
        @SerializedName("releaseDate")
        @Expose
        private String releaseDate;
        @SerializedName("collectionExplicitness")
        @Expose
        private String collectionExplicitness;
        @SerializedName("trackExplicitness")
        @Expose
        private String trackExplicitness;
        @SerializedName("trackTimeMillis")
        @Expose
        private Integer trackTimeMillis;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("currency")
        @Expose
        private String currency;
        @SerializedName("primaryGenreName")
        @Expose
        private String primaryGenreName;
        @SerializedName("collectionId")
        @Expose
        private Integer collectionId;
        @SerializedName("collectionName")
        @Expose
        private String collectionName;
        @SerializedName("collectionCensoredName")
        @Expose
        private String collectionCensoredName;
        @SerializedName("collectionViewUrl")
        @Expose
        private String collectionViewUrl;
        @SerializedName("discCount")
        @Expose
        private Integer discCount;
        @SerializedName("discNumber")
        @Expose
        private Integer discNumber;
        @SerializedName("trackCount")
        @Expose
        private Integer trackCount;
        @SerializedName("trackNumber")
        @Expose
        private Integer trackNumber;
        @SerializedName("contentAdvisoryRating")
        @Expose
        private String contentAdvisoryRating;

        public String getWrapperType() {
            return wrapperType;
        }

        public void setWrapperType(String wrapperType) {
            this.wrapperType = wrapperType;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public Integer getArtistId() {
            return artistId;
        }

        public void setArtistId(Integer artistId) {
            this.artistId = artistId;
        }

        public Integer getTrackId() {
            return trackId;
        }

        public void setTrackId(Integer trackId) {
            this.trackId = trackId;
        }

        public String getArtistName() {
            return artistName;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public String getTrackName() {
            return trackName;
        }

        public void setTrackName(String trackName) {
            this.trackName = trackName;
        }

        public String getTrackCensoredName() {
            return trackCensoredName;
        }

        public void setTrackCensoredName(String trackCensoredName) {
            this.trackCensoredName = trackCensoredName;
        }

        public String getArtistViewUrl() {
            return artistViewUrl;
        }

        public void setArtistViewUrl(String artistViewUrl) {
            this.artistViewUrl = artistViewUrl;
        }

        public String getTrackViewUrl() {
            return trackViewUrl;
        }

        public void setTrackViewUrl(String trackViewUrl) {
            this.trackViewUrl = trackViewUrl;
        }

        public String getPreviewUrl() {
            return previewUrl;
        }

        public void setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
        }

        public String getArtworkUrl30() {
            return artworkUrl30;
        }

        public void setArtworkUrl30(String artworkUrl30) {
            this.artworkUrl30 = artworkUrl30;
        }

        public String getArtworkUrl60() {
            return artworkUrl60;
        }

        public void setArtworkUrl60(String artworkUrl60) {
            this.artworkUrl60 = artworkUrl60;
        }

        public String getArtworkUrl100() {
            return artworkUrl100;
        }

        public void setArtworkUrl100(String artworkUrl100) {
            this.artworkUrl100 = artworkUrl100;
        }

        public Double getCollectionPrice() {
            return collectionPrice;
        }

        public void setCollectionPrice(Double collectionPrice) {
            this.collectionPrice = collectionPrice;
        }

        public Double getTrackPrice() {
            return trackPrice;
        }

        public void setTrackPrice(Double trackPrice) {
            this.trackPrice = trackPrice;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getCollectionExplicitness() {
            return collectionExplicitness;
        }

        public void setCollectionExplicitness(String collectionExplicitness) {
            this.collectionExplicitness = collectionExplicitness;
        }

        public String getTrackExplicitness() {
            return trackExplicitness;
        }

        public void setTrackExplicitness(String trackExplicitness) {
            this.trackExplicitness = trackExplicitness;
        }

        public Integer getTrackTimeMillis() {
            return trackTimeMillis;
        }

        public void setTrackTimeMillis(Integer trackTimeMillis) {
            this.trackTimeMillis = trackTimeMillis;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getPrimaryGenreName() {
            return primaryGenreName;
        }

        public void setPrimaryGenreName(String primaryGenreName) {
            this.primaryGenreName = primaryGenreName;
        }

        public Integer getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(Integer collectionId) {
            this.collectionId = collectionId;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        public String getCollectionCensoredName() {
            return collectionCensoredName;
        }

        public void setCollectionCensoredName(String collectionCensoredName) {
            this.collectionCensoredName = collectionCensoredName;
        }

        public String getCollectionViewUrl() {
            return collectionViewUrl;
        }

        public void setCollectionViewUrl(String collectionViewUrl) {
            this.collectionViewUrl = collectionViewUrl;
        }

        public Integer getDiscCount() {
            return discCount;
        }

        public void setDiscCount(Integer discCount) {
            this.discCount = discCount;
        }

        public Integer getDiscNumber() {
            return discNumber;
        }

        public void setDiscNumber(Integer discNumber) {
            this.discNumber = discNumber;
        }

        public Integer getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(Integer trackCount) {
            this.trackCount = trackCount;
        }

        public Integer getTrackNumber() {
            return trackNumber;
        }

        public void setTrackNumber(Integer trackNumber) {
            this.trackNumber = trackNumber;
        }

        public String getContentAdvisoryRating() {
            return contentAdvisoryRating;
        }

        public void setContentAdvisoryRating(String contentAdvisoryRating) {
            this.contentAdvisoryRating = contentAdvisoryRating;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "artistId=" + artistId +
                    ", trackId=" + trackId +
                    ", artistName='" + artistName + '\'' +
                    ", trackName='" + trackName + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MusicVideoModel{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
