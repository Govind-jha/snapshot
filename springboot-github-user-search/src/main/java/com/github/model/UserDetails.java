package com.github.model;

public class UserDetails {
	private String organizations_url;

	private String received_events_url;

	private String avatar_url;

	private String gravatar_id;

	private String public_gists;

	private String location;

	private String site_admin;

	private String type;

	private String blog;

	private String node_id;

	private String id;

	private String following;

	private String followers;

	private String public_repos;

	private String name;

	private String following_url;

	private String created_at;

	private String events_url;

	private String login;

	private String subscriptions_url;

	private String repos_url;

	private String gists_url;

	private String starred_url;

	private String url;

	private String html_url;

	private String hireable;

	private String updated_at;

	private String bio;

	private String email;

	private String company;

	private String followers_url;

	public String getOrganizations_url() {
		return organizations_url;
	}

	public void setOrganizations_url(String organizations_url) {
		this.organizations_url = organizations_url;
	}

	public String getReceived_events_url() {
		return received_events_url;
	}

	public void setReceived_events_url(String received_events_url) {
		this.received_events_url = received_events_url;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getGravatar_id() {
		return gravatar_id;
	}

	public void setGravatar_id(String gravatar_id) {
		this.gravatar_id = gravatar_id;
	}

	public String getPublic_gists() {
		return public_gists;
	}

	public void setPublic_gists(String public_gists) {
		this.public_gists = public_gists;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSite_admin() {
		return site_admin;
	}

	public void setSite_admin(String site_admin) {
		this.site_admin = site_admin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}

	public String getFollowers() {
		return followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}

	public String getPublic_repos() {
		return public_repos;
	}

	public void setPublic_repos(String public_repos) {
		this.public_repos = public_repos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFollowing_url() {
		return following_url;
	}

	public void setFollowing_url(String following_url) {
		this.following_url = following_url;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getEvents_url() {
		return events_url;
	}

	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSubscriptions_url() {
		return subscriptions_url;
	}

	public void setSubscriptions_url(String subscriptions_url) {
		this.subscriptions_url = subscriptions_url;
	}

	public String getRepos_url() {
		return repos_url;
	}

	public void setRepos_url(String repos_url) {
		this.repos_url = repos_url;
	}

	public String getGists_url() {
		return gists_url;
	}

	public void setGists_url(String gists_url) {
		this.gists_url = gists_url;
	}

	public String getStarred_url() {
		return starred_url;
	}

	public void setStarred_url(String starred_url) {
		this.starred_url = starred_url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getHireable() {
		return hireable;
	}

	public void setHireable(String hireable) {
		this.hireable = hireable;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFollowers_url() {
		return followers_url;
	}

	public void setFollowers_url(String followers_url) {
		this.followers_url = followers_url;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDetails [");
		if (organizations_url != null) {
			builder.append("organizations_url=");
			builder.append(organizations_url);
			builder.append(", ");
		}
		if (received_events_url != null) {
			builder.append("received_events_url=");
			builder.append(received_events_url);
			builder.append(", ");
		}
		if (avatar_url != null) {
			builder.append("avatar_url=");
			builder.append(avatar_url);
			builder.append(", ");
		}
		if (gravatar_id != null) {
			builder.append("gravatar_id=");
			builder.append(gravatar_id);
			builder.append(", ");
		}
		if (public_gists != null) {
			builder.append("public_gists=");
			builder.append(public_gists);
			builder.append(", ");
		}
		if (location != null) {
			builder.append("location=");
			builder.append(location);
			builder.append(", ");
		}
		if (site_admin != null) {
			builder.append("site_admin=");
			builder.append(site_admin);
			builder.append(", ");
		}
		if (type != null) {
			builder.append("type=");
			builder.append(type);
			builder.append(", ");
		}
		if (blog != null) {
			builder.append("blog=");
			builder.append(blog);
			builder.append(", ");
		}
		if (node_id != null) {
			builder.append("node_id=");
			builder.append(node_id);
			builder.append(", ");
		}
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (following != null) {
			builder.append("following=");
			builder.append(following);
			builder.append(", ");
		}
		if (followers != null) {
			builder.append("followers=");
			builder.append(followers);
			builder.append(", ");
		}
		if (public_repos != null) {
			builder.append("public_repos=");
			builder.append(public_repos);
			builder.append(", ");
		}
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (following_url != null) {
			builder.append("following_url=");
			builder.append(following_url);
			builder.append(", ");
		}
		if (created_at != null) {
			builder.append("created_at=");
			builder.append(created_at);
			builder.append(", ");
		}
		if (events_url != null) {
			builder.append("events_url=");
			builder.append(events_url);
			builder.append(", ");
		}
		if (login != null) {
			builder.append("login=");
			builder.append(login);
			builder.append(", ");
		}
		if (subscriptions_url != null) {
			builder.append("subscriptions_url=");
			builder.append(subscriptions_url);
			builder.append(", ");
		}
		if (repos_url != null) {
			builder.append("repos_url=");
			builder.append(repos_url);
			builder.append(", ");
		}
		if (gists_url != null) {
			builder.append("gists_url=");
			builder.append(gists_url);
			builder.append(", ");
		}
		if (starred_url != null) {
			builder.append("starred_url=");
			builder.append(starred_url);
			builder.append(", ");
		}
		if (url != null) {
			builder.append("url=");
			builder.append(url);
			builder.append(", ");
		}
		if (html_url != null) {
			builder.append("html_url=");
			builder.append(html_url);
			builder.append(", ");
		}
		if (hireable != null) {
			builder.append("hireable=");
			builder.append(hireable);
			builder.append(", ");
		}
		if (updated_at != null) {
			builder.append("updated_at=");
			builder.append(updated_at);
			builder.append(", ");
		}
		if (bio != null) {
			builder.append("bio=");
			builder.append(bio);
			builder.append(", ");
		}
		if (email != null) {
			builder.append("email=");
			builder.append(email);
			builder.append(", ");
		}
		if (company != null) {
			builder.append("company=");
			builder.append(company);
			builder.append(", ");
		}
		if (followers_url != null) {
			builder.append("followers_url=");
			builder.append(followers_url);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}

	