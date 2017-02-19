package me.superblaubeere27.minecraft.generators.commands.tellraw;

import java.text.MessageFormat;

import com.google.gson.JsonObject;

public class TellrawComponent {
	private String text;
	private String selector;
	private String color;
	private boolean useObfuscation;
	private boolean obfuscated;
	private boolean strikethought;
	private boolean underlined;
	private boolean bold;
	private boolean italic;
	private String score_name;
	private String score_objective;

	public TellrawComponent() {
		// TODO Auto-generated constructor stub
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bold ? 1231 : 1237);
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (italic ? 1231 : 1237);
		result = prime * result + (obfuscated ? 1231 : 1237);
		result = prime * result
				+ ((score_name == null) ? 0 : score_name.hashCode());
		result = prime * result
				+ ((score_objective == null) ? 0 : score_objective.hashCode());
		result = prime * result
				+ ((selector == null) ? 0 : selector.hashCode());
		result = prime * result + (strikethought ? 1231 : 1237);
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + (underlined ? 1231 : 1237);
		result = prime * result + (useObfuscation ? 1231 : 1237);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TellrawComponent other = (TellrawComponent) obj;
		if (bold != other.bold)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (italic != other.italic)
			return false;
		if (obfuscated != other.obfuscated)
			return false;
		if (score_name == null) {
			if (other.score_name != null)
				return false;
		} else if (!score_name.equals(other.score_name))
			return false;
		if (score_objective == null) {
			if (other.score_objective != null)
				return false;
		} else if (!score_objective.equals(other.score_objective))
			return false;
		if (selector == null) {
			if (other.selector != null)
				return false;
		} else if (!selector.equals(other.selector))
			return false;
		if (strikethought != other.strikethought)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (underlined != other.underlined)
			return false;
		if (useObfuscation != other.useObfuscation)
			return false;
		return true;
	}

	public TellrawComponent(String selector) {
		super();
		this.selector = selector;
	}

	public TellrawComponent(String text, String color) {
		super();
		this.text = text;
		this.color = color;
	}

	public String toString() {
		return MessageFormat
				.format("TellrawComponent [text={0}, selector={1}, color={2}, useObfuscation={3}, obfuscated={4}, strikethought={5}, underlined={6}, bold={7}, italic={8}, score_name={9}, score_objective={10}, hashCode()={11}]",
						new Object[] { text, selector, color,
								new Boolean(useObfuscation),
								new Boolean(obfuscated),
								new Boolean(strikethought),
								new Boolean(underlined), new Boolean(bold),
								new Boolean(italic), score_name,
								score_objective, new Integer(hashCode()) });
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSelector() {
		return selector;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isUseObfuscation() {
		return useObfuscation;
	}

	public void setUseObfuscation(boolean useObfuscation) {
		this.useObfuscation = useObfuscation;
	}

	public boolean isObfuscated() {
		return obfuscated;
	}

	public void setObfuscated(boolean obfuscated) {
		this.obfuscated = obfuscated;
	}

	public boolean isStrikethought() {
		return strikethought;
	}

	public void setStrikethought(boolean strikethought) {
		this.strikethought = strikethought;
	}

	public boolean isUnderlined() {
		return underlined;
	}

	public void setUnderlined(boolean underlined) {
		this.underlined = underlined;
	}

	public boolean isBold() {
		return bold;
	}

	public void setBold(boolean bold) {
		this.bold = bold;
	}

	public boolean isItalic() {
		return italic;
	}

	public void setItalic(boolean italic) {
		this.italic = italic;
	}
	public String getScore_name() {
		return score_name;
	}

	public void setScore_name(String score_name) {
		this.score_name = score_name;
	}

	public String getScore_objective() {
		return score_objective;
	}

	public void setScore_objective(String score_objective) {
		this.score_objective = score_objective;
	}

	public JsonObject toJsonObject() {
		JsonObject out = new JsonObject();
		if(selector != null) {
			out.addProperty("selector", selector);
			return out;
		}
		if(score_name != null) {
			JsonObject scoreObject = new JsonObject();
			scoreObject.addProperty("name", score_name);
			scoreObject.addProperty("objective", score_objective);
			out.add("score", scoreObject);
			return out;
		}
		if(bold) {
			out.addProperty("bold", Boolean.valueOf(bold));
		}
		if(italic) {
			out.addProperty("italic", Boolean.valueOf(italic));
		}
		if(underlined) {
			out.addProperty("underlined", Boolean.valueOf(underlined));
		}
		if(strikethought) {
			out.addProperty("strikethought", Boolean.valueOf(strikethought));
		}
		if(useObfuscation) {
			out.addProperty("obfuscated", Boolean.valueOf(obfuscated));
		}
		out.addProperty("text", text);
		if(!color.equals("")) {
			out.addProperty("color", color);
		}
		return out;
	}
}
