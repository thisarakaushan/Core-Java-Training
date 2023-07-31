/*Query 1*/

/*We want to reward our users who have been around the longest.  
Find the 5 oldest users.*/
SELECT * FROM users
ORDER BY created_at
LIMIT 5;


/*Query 2*/

select * from users;
/*What day of the week do most users register on?
We need to figure out when to schedule an ad campgain*/

SELECT EXTRACT(dow FROM created_at) AS "Day of week", COUNT(*) 
FROM users
GROUP BY 1
ORDER BY 2 DESC;

/*version 2*/
/*This will give name of day instead of giving number for day*/
SELECT to_char(created_at, 'DAY') AS day, COUNT(*) AS total
FROM users
GROUP BY day
ORDER BY total DESC;


/*Query 3*/

/*We want to target our inactive users with an email campaign.
Find the users who have never posted a photo*/
SELECT username
FROM users
LEFT JOIN photos ON users.id = photos.user_id
WHERE photos.id IS NULL;


/*Query 4*/

/*Our Investors want to know...
How many times does the average user post?*/
/*total number of photos/total number of users*/
SELECT ROUND((SELECT COUNT(*)FROM photos)/(SELECT COUNT(*) FROM users),2);


/*Query 5*/

/*user ranking by postings higher to lower*/
SELECT users.username,COUNT(photos.image_url)
FROM users
JOIN photos ON users.id = photos.user_id
GROUP BY users.id
ORDER BY 2 DESC;


/*Query 6*/

/*Total Posts by users (longer version of SELECT COUNT(*)FROM photos) */
SELECT SUM(user_posts.total_posts_per_user)
FROM (SELECT users.username,COUNT(photos.image_url) AS total_posts_per_user
		FROM users
		JOIN photos ON users.id = photos.user_id
		GROUP BY users.id) AS user_posts;


/*Query 7*/

/*total numbers of users who have posted at least one time */
SELECT COUNT(DISTINCT(users.id)) AS total_number_of_users_with_posts
FROM users
JOIN photos ON users.id = photos.user_id;


/*Query 8*/

/*A brand wants to know which hashtags to use in a post
What are the top 5 most commonly used hashtags?*/
SELECT tag_name, COUNT(tag_name) AS total
FROM tags
JOIN photo_tags ON tags.id = photo_tags.tag_id
GROUP BY tags.id
ORDER BY total DESC;


/*Query 9*/

/*We also have a problem with celebrities
Find users(give the users names) who have never commented on a photo*/
SELECT username, comment_text
FROM users
LEFT JOIN comments ON users.id = comments.user_id
GROUP BY users.id,comment_text
HAVING comment_text IS NULL;

/*version 2*/
/*Get the number of the users who have never commented on a photo*/
SELECT COUNT(*) FROM
(SELECT username,comment_text
	FROM users
	LEFT JOIN comments ON users.id = comments.user_id
	GROUP BY users.id,comment_text
	HAVING comment_text IS NULL) AS total_number_of_users_without_comments;

/*Query 10*/

/*Find users who have ever commented on a photo
means users who have atleast commented on any of the photo*/
/*this way give the all names of the users*/
SELECT username,comment_text
FROM users
LEFT JOIN comments ON users.id = comments.user_id
GROUP BY users.id,comment_text
HAVING comment_text IS NOT NULL;

/*version 2*/
/*give the number of users who have atleast commented on any of the photo*/
SELECT COUNT(*) FROM
(SELECT username,comment_text
	FROM users
	LEFT JOIN comments ON users.id = comments.user_id
	GROUP BY users.id,comment_text
	HAVING comment_text IS NOT NULL) AS total_number_users_with_comments;